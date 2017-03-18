(ns dice.core
  (:gen-class))

(defn rolld
  "rolls a d-sided die"
  ([] nil)
  ([d] (+ (rand-int d) (if (= d 0) 0 1))))

(defrecord Die [sides])

(defn roll
  "rolls a single die, or dice"
  ([] nil)
  ([die] (rolld (:sides die)))
  ([die & more] (map roll (conj more die))))

