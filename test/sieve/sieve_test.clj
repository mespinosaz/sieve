(ns sieve.sieve-test
  (:require [clojure.test :refer :all]
            [sieve.sieve :refer :all]))

(deftest sieve-test
  (testing "FIXME, I fail."
    (is (= (sieve 1) []))
    (is (= (sieve 2) [2]))
    (is (= (sieve 3) [2 3]))
    (is (= (sieve 50) [2 3 5 7 11 13 17 19 23 29 31 37 41 43 47]))))
