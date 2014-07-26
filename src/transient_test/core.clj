(ns transient-test.core
  (:require [criterium.core :refer [bench]])
  (:gen-class))



(defn run-test-persistent []
  (let [coll {}]
    (dotimes [x 10000]
      (assoc coll 1 x))))

(defn run-test-transient []
  (let [coll (transient {})]
    (dotimes [x 10000]
      (assoc! coll 1 x))))


(defn  -main []
  (bench (run-test-persistent))
  (bench (run-test-transient))
  (println "\n \n"))
