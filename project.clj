(defproject ebs-spike "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [amazonica "0.3.73"]]
  :plugins [[lein-beanstalk "0.2.7"]]
  :ring {:handler ebs-spike.core/handler}
  :aws {:beanstalk {:region "eu-central-1"}})
