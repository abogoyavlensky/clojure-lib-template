# clojure-lib-template

A template for creating a Clojure library.

## Features

- Modern Clojure library project structure following best practices
- Built-in GitHub Actions workflows for CI/CD with publishing to Clojars
- Comprehensive development tooling setup (linting, formatting, deps versions, testing)
- Preconfigured build and deployment to Clojars using [Slim](https://github.com/abogoyavlensky/slim)
- Includes common development tasks via Babashka Tasks
- MIT License by default

## Usage

1. Create a new Clojure library using [frame](https://github.com/abogoyavlensky/frame):
   ```bash
   brew install abogoyavlensky/tap/frame
   frame new https://github.com/abogoyavlensky/clojure-lib-template myproject
   ```

   Or in non-interactive mode:

   ```bash
   frame new https://github.com/abogoyavlensky/clojure-lib-template myproject --var username=myusername
   ```

2. Update the project configuration:
   - Edit library build details in `deps.edn`
   - Edit documentation in `README.md`

3. Start development:
   ```shell
   # Set up repository
   git init
   git add .
   # Run all checks
   bb check
   # Commit initial changes
   git commit -m "Initial commit"
   ```
   
   Manage library:
   ```shell
    # Show all available tasks
    bb tasks 
    # Install library locally
    bb install  
    # Deploy snapshot to Clojars
    bb deploy-snapshot
    # Deploy to Clojars
    bb deploy-release
   ```

## Project structure

The template generates a standard Clojure library project with the following structure:

```
├── .clj-kondo/            # Clojure linting configuration
├── .github/               # GitHub Actions workflows and configurations
├── dev/                   # Development configuration directory
│   └── user.clj           # User-specific development configuration
├── src/                   # Source code directory
│   └── {{name}}           # Main namespace directory
│       └── core.clj       # Main namespace file
├── test/                  # Test files directory
│   └── {{name}}           # Test namespace directory
│       └── core_test.clj  # Test namespace file
├── .cljfmt.edn            # Formatting configuration
├── .gitignore             # Git ignore rules
├── .mise.toml             # mise-en-place configuration with system tools versions
├── bb.edn                 # Babashka tasks configuration
├── deps.edn               # Clojure dependencies and aliases
├── LICENSE                # License file
├── CHANGELOG.md           # Changelog file
└── README.md              # Project documentation
```

## Development

### Requirements

To work with this template, you need:

1. [mise](https://mise.jdx.dev/) (recommended) or manual installation of:
   - [rite](https://github.com/abogoyavlensky/rite) 
   - [frame](https://github.com/abogoyavlensky/frame) 

### Getting Started

Show all management tasks:
```shell
rite tasks
```

Create a project from the template:

```shell
rite new
```

The new project will be created in the `tmpl` directory at the root.

### Release

Once you are ready to release a new version of the template, bump version in `deps.edn`:

```
:aliases -> :build -> :exec-args -> :version -> "0.1.1
```

and then run the following command:

```shell
rite release 0.1.1
```

A new git tag based on latest version will be created and pushed to the repository.

## License
MIT License
Copyright (c) 2025 Andrey Bogoyavlenskiy
