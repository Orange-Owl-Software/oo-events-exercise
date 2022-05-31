(ns oo-events.tabular-report
  (:require [clojure.data.csv :as csv])
  (:import (java.time.temporal ChronoUnit)
           (java.util Date)))

;; you can choose to use this to turn a java.util.Date into a day (a
;; java.time.Instant) in the tabular report
(defn day-of
  "Turn a date into a 'day' by returning midnight UTC on the same day."
  [^Date d]
  (-> d (.toInstant) (.truncatedTo ChronoUnit/DAYS)))

(defn csv-str
  "Turn a table (a list of columns, i.e. a seq of seq's) into a CSV string."
  [table]
  (with-out-str
    (csv/write-csv *out* table)
    (str *out*)))

(defn to-csv
  "Take a sequence of task-completion events of the form:

    `{:id String :date Date :task String :user String :status :complete/:late/:overdue}`

  and generate a CSV-formatted report string summing complete/late/overdue
  tasks, grouped per day/task/user (and output sorted in that order also). The
  `day` for a given date is defined as midnight UTC (see `day-of`).

  Columns in the report are:

    `Day, Task, User, Complete, Late, Overdue`

  Complete, Late, and Overdue contain the counts of events with those statuses
  for that day/task/user."
  [events]
  ;; TODO
  "")
