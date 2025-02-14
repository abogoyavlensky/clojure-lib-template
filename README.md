# clojure-lib-template

A template for creating a Clojure library.

## Usage

To create a new library, run:

```bash
clojure -Ttools install-latest :lib io.github.seancorfield/deps-new :as new
clojure -Sdeps '{:override-deps {org.clojure/clojure {:mvn/version "1.12.0"}}}' -Tnew create :template io.github.abogoyavlensky/clojure-lib-template :name myusername/myproject
```

***Note**: replace `myusername/myproject` with your desired project group id and name. In the most common case if you plan to store your lib's source code on Github it can be `io.github.myusername/myproject`.*

***Note**: if you already have Clojure 1.12 you can ommit the `-Sdeps` part.*

Or alternatively using [neil](https://github.com/babashka/neil:

```bash
neil new io.github.abogoyavlensky/clojure-lib-template myusername/myproject
```

## Features

TODO!

## Lib structure

TODO!

## Development

TODO!

## License
MIT License
Copyright (c) 2025 Andrey Bogoyavlenskiy
