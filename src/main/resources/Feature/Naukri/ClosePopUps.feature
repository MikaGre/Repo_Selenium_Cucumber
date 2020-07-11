Feature: Close pop up windows

  Scenario:Close all advertisements windows EXCEPT main window
  Given Launch www.naukri.com
  And Print title of all windows
  Then Close all advertisements windows EXCEPT main window