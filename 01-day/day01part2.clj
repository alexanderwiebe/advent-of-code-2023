(comment
  "Day 01 Part 2")

(ns day01part2
  (:require [clojure.string :as str]))

 (defn filter-numerics [s]
  (apply str (filter #(Character/isDigit %) s)))

(->> (slurp "/workspaces/codespaces-blank/01-day/real-input.txt")
     (str/split-lines)
     (map filter-numerics)
     (map (juxt first last))
     (map #(clojure.string/join "" %))
     (map #(Integer. %))
     (reduce +)
     (println))