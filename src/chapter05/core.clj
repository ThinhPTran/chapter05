(ns chapter05.core)

(def mytestcomp (comp inc *))

(defn testcomp
  []
  (mytestcomp 2 3))

(def character
  {:name "Smooches McCutes"
   :attributes {:intelligence 10
                :strength 4
                :dexterity 5}})

(def c-int (comp :intelligence :attributes))
(def c-str (comp :strength :attributes))
(def c-dex (comp :dexterity :attributes))

(defn sleepy-identity
  "Returns the given value after 1 second"
  [x]
  (Thread/sleep 1000)
  x)

(def memo-sleepy-identity (memoize sleepy-identity))
  

