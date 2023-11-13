
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
(println (take 20 input))
(doc print)

(def directory (clojure.java.io/file "."))
(def files (file-seq directory))
(take 20 files)
