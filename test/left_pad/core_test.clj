(ns left-pad.core-test
  (:require [clojure.test :refer :all]
            [left-pad.core :refer :all]))

(deftest leftpad-pads-string

  (testing "pads string to proper length"
    (is (= (leftpad "foo" 5) "  foo")))

  (testing "don't add padding if string is already len or longer"
    (is (= (leftpad "foobar" 5) "foobar"))
    (is (= (leftpad "foobar" 6) "foobar"))))
