{
  description = "Flake humble et droit pour Java, Maven et labeur sacré";

  inputs = {
    nixpkgs.url = "github:nixos/nixpkgs?ref=nixos-unstable";
  };

  outputs = {
    self,
    nixpkgs,
  }: let
    pkgs = nixpkgs.legacyPackages."x86_64-linux";
  in {
    devShells."x86_64-linux".default = pkgs.mkShell {
      buildInputs = with pkgs; [
        jdk17
        maven
        gradle
      ];

      JAVA_HOME = pkgs.jdk17.home;
      RUST_SRC_PATH = "${pkgs.rust.packages.stable.rustPlatform.rustLibSrc}";

      shellHook = ''
        java -version
        mvn -version
        neovide &
      '';
    };
  };
}
