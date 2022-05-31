# Orange Owl Events Tabulation Exercise

**DO NOT FORK THIS REPOSITORY IN GITHUB, PLEASE CLONE IT AND FOLLOW THE
INSTRUCTIONS FOR SUBMISSION AT THE END OF THE README**

Hi, and thanks for completing this take home exercise.

The purpose of this exercise is for us to get a sense of your skill level with
Clojure, and to see your approach to solving problems.

The problem we’ve chosen is a simple tabulation function, compiling a grouped
sum of events into a CSV report for export.

## Object

Implement `oo-events.tabular-report/to-csv`, such that running:

      $ ./run-tests

leads to the output:

      lein test oo-events.tabular-report-test

      Ran 1 tests containing 1 assertions.
      0 failures, 0 errors.

## Developing

We’re assuming a macOS development environment for these instructions, but the
process will be very similar, modulo package installation, on Linux and Windows.

### Requirements

1. A modern JVM. OpenJDK 11+ is recommended.
2. [Leiningen](https://leiningen.org)

### Starting a REPL

We’ve provided a Leiningen `project.clj` file with the needed dependencies in
the root directory.

To start an nREPL session:

      $ ./start-nrepl

The nREPL service can be used by Clojure editors such as Emacs CIDER. Other
Clojure IDE’s can also connect to this, or use `project.clj` directly for
configuration.

### Completing the Code

Open `src/oo_events/tabular_report.clj` and its test in
`test/oo_events/tabular_report_test.clj`.

Once you’ve understood the requirements, implement `to-csv` such that the test
passes.

## Submission

When you’ve completed the exercise and wish to submit your work, please do the following:

1. Make sure all your work is commited to your branch. Good commit messages and
   telling a story through the commits is a good thing.

2. Zip up the folder containing your repo and send to either your recruitment
   contact or support@orange-owl.com.

**DO NOT PUSH THE REPO UP TO GITHUB OR CREATE A PULL REQUEST AGAINST THIS REPO**
