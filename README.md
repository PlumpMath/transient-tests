# transient-test

A Clojure library designed to ... well, that part is up to you.

## Usage

Run `lein uberjer` then run `java -jar target/transient-test-0.1.0-SNAPSHOT-standalone.jar`

Results on my machine (persistent hashmaps first). 

```
Evaluation count : 195660 in 60 samples of 3261 calls.
             Execution time mean : 312.278255 µs
    Execution time std-deviation : 13.751476 µs
   Execution time lower quantile : 297.336310 µs ( 2.5%)
   Execution time upper quantile : 347.777724 µs (97.5%)
                   Overhead used : 1.623337 ns

Found 4 outliers in 60 samples (6.6667 %)
	low-severe	 4 (6.6667 %)
 Variance from outliers : 30.3200 % Variance is moderately inflated by outliers
Evaluation count : 547560 in 60 samples of 9126 calls.
             Execution time mean : 110.667967 µs
    Execution time std-deviation : 1.417419 µs
   Execution time lower quantile : 108.755554 µs ( 2.5%)
   Execution time upper quantile : 112.989775 µs (97.5%)
                   Overhead used : 1.623337 ns

```

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
