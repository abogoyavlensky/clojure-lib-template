# {{main/ns}}

[![Clojars Project](https://img.shields.io/clojars/v/{{name}}.svg)](https://clojars.org/{{name}})
[![cljdoc badge](https://cljdoc.org/badge/{{name}})](https://cljdoc.org/jump/release/{{name}})
[![CI]({{scm/repo}}/actions/workflows/snapshot.yaml/badge.svg?branch=master)]({{scm/repo}}/actions/workflows/snapshot.yaml)

{{description}}

## Overview

*TODO: Add library description*

## Development

### Requirements
Install Java, Clojure and Babashka manually or via [mise](https://mise.jdx.dev/):

```shell
mise install
```

*Note: Check versions in `.mise.toml` file.*

### Manage project

All management tasks:

```shell
bb tasks
The following tasks are available:

deps            Install all deps
fmt-check       Check code formatting
fmt             Fix code formatting
lint-init       Import linting configs
lint            Linting project's code
test            Run tests
outdated-check  Check outdated Clojure deps versions
outdated        Upgrade outdated Clojure deps versions
check           Run all code checks and tests
install         Install version locally
deploy-snapshot Deploy snapshot version to Clojars
deploy-release  Deploy release version to Clojars
release         Create and push git tag for release
```

## Build and publish

### Install locally

```shell
bb install
```

### Deploy to Clojars from local machine

**Note:** Publishing to Clojars requires `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` environment variables.

Deploy snapshost version:

```shell
bb deploy-snapshot
```

Deploy release version:

```shell
bb deploy-release
```

### Deploy to Clojars from Github Actions

Set up following secrets for Actions:

- `CLOJARS_USERNAME`
- `CLOJARS_PASSWORD`

Then you will be able to push to master branch to deploy snapshot version automatically.

Once you decide to publish release you just need to bump version at deps.edn:

`:aliases -> :build -> :exec-args -> :version -> "0.1.1`

and create a git tag with this version. There is a shortcut command for this:

```shell
bb release
```

This command will create a git tag with the latest version from deps.edn and push it to git repository.
Github Actions will automatically deploy a release version to Clojars.

## License
MIT License
Copyright (c) {{now/year}} {{developer}}
