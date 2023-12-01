
(ns sample
  (:require [clojure.string :as str]
  [clojure.java.io :as io]))
(require '[clojure.repl :refer :all])

(comment
  "comment"
  :rcf)

(def myfn (fn [arg] (+ arg 3)))
(myfn 4)
(println "hello world")
(def input (str/split-lines (slurp "/workspaces/codespaces-blank/problem-input.txt")))
(def top20 (map #(Integer/parseInt %) (take 20 input)))

(println top20)
(reduce + top20)
(println (take 20 input))

(println (map (Integer/parseInt "5"))

(doc print)

(def directory (clojure.java.io/file "."))
(def files (file-seq directory))
(take 20 files)
