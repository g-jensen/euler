(ns euler.level1.problem007)

(defn prime? [n]
  (cond
    (<= n 1) false
    (<= n 3) true
    (zero? (mod n 2)) false
    (zero? (mod n 3)) false
    :else (every? #(and (not= 0 (mod n %))
                        (not= 0 (mod n (+ 2 %))))
                  (range 5 (inc (Math/sqrt n)) 6))))

(defn primes [n]
  (loop [m 2 primes []]
    (if (>= (count primes) n)
      primes
      (if (every? #(not= 0 (mod m %)) primes)
        (recur (inc m) (conj primes m))
        (recur (inc m) primes)))))

(defn lazy-primes-overflows
  ([] (lazy-primes-overflows (iterate inc 2)))
  ([primes] (let [prime (first primes)
                  filtered (filter #(not= 0 (mod % prime)) (rest primes))]
              (cons prime (lazy-seq (lazy-primes-overflows filtered))))))

(defn lazy-primes
  ([] (lazy-primes 2 []))
  ([m primes] (if (prime? m)
                (cons m (lazy-seq (lazy-primes (inc m) (conj primes m))))
                (lazy-primes (inc m) primes))))

(defn euler-7 [n]
  #_(last (primes n))
  #_(nth (lazy-primes) (dec n))
  (loop [i 0 m 1]
    (if (>= i n)
      (dec m)
      (recur (if (prime? m) (inc i) i) (inc m)))))