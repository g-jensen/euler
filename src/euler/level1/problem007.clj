(ns euler.level1.problem007)

(defn primes [n]
  (loop [m 2 primes []]
    (if (>= (count primes) n)
      primes
      (if (every? #(not= 0 (mod m %)) primes)
        (recur (inc m) (conj primes m))
        (recur (inc m) primes)))))

(defn lazy-primes-slow-and-overflows
  ([] (lazy-primes-slow-and-overflows (iterate inc 2)))
  ([primes] (let [prime (first primes)
                  filtered (filter #(not= 0 (mod % prime)) (rest primes))]
              (cons prime (lazy-seq (lazy-primes-slow-and-overflows filtered))))))

(defn lazy-primes
  ([] (lazy-primes 2 []))
  ([n primes] (if (every? #(not= 0 (mod n %)) primes)
                (cons n (lazy-seq (lazy-primes (inc n) (conj primes n))))
                (lazy-primes (inc n) primes))))

(defn euler-7 [n]
  (nth (lazy-primes) (dec n)))