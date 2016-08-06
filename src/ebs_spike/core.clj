(ns ebs-spike.core
  (:require
   [clojure.pprint :refer [pprint]]
   [amazonica.aws.elasticbeanstalk :refer [describe-applications describe-environments]]))

(defn handler
  [request]
  {:status 200
   :body (with-out-str
           (pprint
            [(describe-applications)
             (describe-environments)]))})
