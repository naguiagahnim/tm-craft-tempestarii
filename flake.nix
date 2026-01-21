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
        jdk21
        maven
        gradle
      ];

      JAVA_HOME = pkgs.jdk17.home;
      RUST_SRC_PATH = "${pkgs.rust.packages.stable.rustPlatform.rustLibSrc}";

      shellHook = ''
                        java -version

        java -version
        echo $JAVA_HOME
                        mvn -version
                export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which java))))
                export PATH=$JAVA_HOME/bin:$PATH
                        neovide &
      '';
    };
  };
}
