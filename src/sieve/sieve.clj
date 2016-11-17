(ns sieve.sieve)

(defn numbers-until-root
	[n]
	(take-while #(< % (Math/sqrt n)) (range 2 (inc n))))

(defn serie
	[i n]
	(map #(+ (* i i) (* % i)) (range 0 (inc n))))

(defn quadratics
	[n]
	(set (flatten (map #(serie % n) (numbers-until-root n)))))

(defn sieve
  "Sieve of Erasthotenes"
	[n]
	(filter #((complement contains?) (quadratics n) %) (range 2 (inc n))))
