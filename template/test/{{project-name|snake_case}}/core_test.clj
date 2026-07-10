(ns {{ project-name }}.core-test
  (:require [clojure.test :refer :all]
            [{{ project-name }}.core :as core]))

(deftest test-sum
  (is (= 3 (core/sum 1 2))))
