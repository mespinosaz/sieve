(ns sieve.core
  (:gen-class))

(use 'clojure.data)
(use 'sieve.sieve)

(defn -main
  [& args]
  (println (sieve (Integer. (first args)))))
