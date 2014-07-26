# transient-test

A Clojure library designed to ... well, that part is up to you.

## Usage

Run `lein uberjer` then run `java -jar target/transient-test-0.1.0-SNAPSHOT-standalone.jar`

Results on my machine (persistent hashmaps first). 

```

Evaluation count : 186540 in 60 samples of 3109 calls.
             Execution time mean : 323.069478 µs
    Execution time std-deviation : 9.014042 µs
   Execution time lower quantile : 315.402366 µs ( 2.5%)
   Execution time upper quantile : 341.388214 µs (97.5%)
                   Overhead used : 1.943787 ns

Found 6 outliers in 60 samples (10.0000 %)
	low-severe	 3 (5.0000 %)
	low-mild	 3 (5.0000 %)
 Variance from outliers : 15.7374 % Variance is moderately inflated by outliers
Evaluation count : 7320 in 60 samples of 122 calls.
             Execution time mean : 8.265176 ms
    Execution time std-deviation : 81.783373 µs
   Execution time lower quantile : 8.150441 ms ( 2.5%)
   Execution time upper quantile : 8.430301 ms (97.5%)
                   Overhead used : 1.943787 ns

```

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
