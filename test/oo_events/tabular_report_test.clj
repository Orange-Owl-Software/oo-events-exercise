(ns oo-events.tabular-report-test
  (:require [clojure.string :as str]
            [clojure.test :refer [deftest is testing]]
            [oo-events.tabular-report :as tabular-report]))

(deftest test-events-csv
  (let [events  [{:id "1" :date #inst "2022-01-01T00:01" :task "task-1" :user "user-1" :status :complete}
                 {:id "2" :date #inst "2022-01-01T00:02" :task "task-1" :user "user-1" :status :overdue}
                 {:id "3" :date #inst "2022-01-01T00:03" :task "task-2" :user "user-1" :status :complete}
                 {:id "4" :date #inst "2022-01-01T00:04" :task "task-1" :user "user-2" :status :complete}
                 {:id "4" :date #inst "2022-01-01T00:05" :task "task-1" :user "user-2" :status :late}

                 {:id "5" :date #inst "2022-01-02T00:01" :task "task-1" :user "user-1" :status :overdue}
                 {:id "6" :date #inst "2022-01-02T00:02" :task "task-1" :user "user-1" :status :late}
                 {:id "7" :date #inst "2022-01-02T00:03" :task "task-2" :user "user-2" :status :complete}
                 {:id "8" :date #inst "2022-01-02T00:04" :task "task-2" :user "user-2" :status :overdue}
                 {:id "9" :date #inst "2022-01-02T00:05" :task "task-1" :user "user-2" :status :late}]
        csv-rows ["Day,Task,User,Complete,Late,Overdue"
                  "2022-01-01T00:00:00Z,task-1,user-1,1,0,1"
                  "2022-01-01T00:00:00Z,task-1,user-2,1,1,0"
                  "2022-01-01T00:00:00Z,task-2,user-1,1,0,0"
                  "2022-01-02T00:00:00Z,task-1,user-1,0,1,1"
                  "2022-01-02T00:00:00Z,task-1,user-2,0,1,0"
                  "2022-01-02T00:00:00Z,task-2,user-2,1,0,1"]]
    (testing "correct CSV generated"
      (is (= csv-rows
             (-> (tabular-report/to-csv events)
                 (str/split #"\n")))))))
