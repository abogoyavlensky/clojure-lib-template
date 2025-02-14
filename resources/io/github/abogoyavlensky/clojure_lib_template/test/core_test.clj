(ns {{main/ns}}.core-test
  (:require [clojure.test :refer :all]
            [{{main/ns}}.core :as core]))

(deftest test-sum
  (is (= 3 (core/sum 1 2))))
