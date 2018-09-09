# Spring Casino Framework
* **Objective:**
    * To create a casino simulation.

* **Purpose:**
    * To establish comfort with end-to-end application development

* **Description:**
    * The following project has many pre-built tools to help build and scale your project as quickly as possible.
        * Familiarize yourself with the general infrastructure and utilities, then build a plan of action for how to scale the project as a group.
        * If you find the infrastructure disagreeable, you may completely scrap it, or borrow just what is needed.
    * Ensure there are at least 5 playable games in total.
    * The minimum technology stack for the completion of the project is `Spring`, and `Angular`.
        * Additional technologies like [Jasmine](https://en.wikipedia.org/wiki/Jasmine_(JavaScript_testing_framework)), [Travis](travis-ci.org/), or [Cucumber](https://cucumber.io/), are encouraged but not required.


### Infrastructure Overview

* `CasinoProfile`
    * Stores information about a casino client; `id`, `name`, `balance`

#### `casino.games.schema` package
* The `schema` package provides infrastructure to enforce 3 critical aspects:
    1. `Player` has a `Profile`.
    2. `Game` has a 1-to-many relationship with players.
    3. `GameEngine` mediates the behavior between a `Game` and many `Player` objects.
    
#### `casino.games.cardgames.toolkit` package
* The `toolkit` package provides utilities for card games including
    * `Card` object, has a `Rank` and `Suit`
    * `Deck` object, is a `Stack` representation of `Card` objects
    * `Hand` object, has a `List` of `Card` objects
    * `CardPlayer` is a `Player` and has a `Hand`
    * `CardDealer` is a `CardPlayer` and has a `Deck`
    
### `casino.utils` package
* The `utils` package provides a location to place general utility classes if needed.
* `RandomGenerator` has been provided to you.
    * Can generate random `int`, `double`, `boolean` objects as well as select random elements from a collection. 