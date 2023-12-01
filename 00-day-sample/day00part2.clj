(comment
  "Day 00 Part 2")

(ns day00part1
  (:require [clojure.string :as str]))

(->> (slurp "/workspaces/codespaces-blank/00-day-sample/real-input.txt")
     (str/split-lines)
     (map #(if (empty? %) :blank (Integer. %)))
     (partition-by #(= :blank %))
     (filter #(not (= [:blank] %)))
     (map #(reduce + %))
     (sort >)
     (take 3) ;; take 1 for part 1
     (reduce +)
     (println))