(comment
  "Day 01 Part 2")

(ns day01part2
  (:require [clojure.string :as str]))

(defn filter-numerics [s]
  (apply str (filter #(Character/isDigit %) s)))

(defn matchStringDigit [s]
  (case s "one" "1"
        "two" "2"
        "three" "3"
        "four" "4"
        "five" "5"
        "six" "6"
        "seven" "7"
        "eight" "8"
        "nine" "9"
        s))

(defn matchStringDigitR [s]
  (case s "eno" "1"
        "owt" "2"
        "eerht" "3"
        "ruof" "4"
        "evif" "5"
        "xis" "6"
        "neves" "7"
        "thgie" "8"
        "enin" "9"
        s))

(defn matchStringDigitBen [s]
  (case s "one" "o1e"
        "two" "t2o"
        "three" "t3e"
        "four" "f4r"
        "five" "f5e"
        "six" "s6x"
        "seven" "s7n"
        "eight" "e8t"
        "nine" "n9e"
        s))

(defn firstDigit [s]
  (str/replace-first s #"one|two|three|four|five|six|seven|eight|nine|1|2|3|4|5|6|7|8|9" matchStringDigit))
(firstDigit "2eightwothree3")

(defn lastDigit [s]
  (-> s
      (str/reverse)
      (str/replace-first #"enin|thgie|neves|xis|evif|ruof|eerht|owt|eno|1|2|3|4|5|6|7|8|9" matchStringDigitR)
      (str/reverse)))
(lastDigit "2eightwothree3")

(defn replaceAll [s] ; not used
  (str/replace s #"one|two|three|four|five|six|seven|eight|nine" matchStringDigitBen))
(replaceAll "2eightwothree3")

(defn lineFormat [l]
  (->> l
       (comp firstDigit
             lastDigit
             filter-numerics
             (juxt first last))))
(lineFormat "2eightwo3three3")


(->> (slurp "/workspaces/codespaces-blank/01-day/real-input.txt")
     (str/split-lines)
     (map firstDigit)
     (map lastDigit)
     (map filter-numerics)
     (map (juxt first last))
     (map #(clojure.string/join "" %))
     (map #(Integer. %))
     (reduce +)
     (println))