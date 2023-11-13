(comment
  "Day 00 Part 1")

(ns day00part1
  (:require [clojure.string :as str]))

(def input (str/split-lines (slurp "/workspaces/codespaces-blank/00-day-sample/sample-input.txt")))
(println input)