    [idea] #174 taking no.of tiny editors in featured pane through settings panel
    
    fixes #174
    
    Steps to test:
    1. Open Settings Panel.
	2. Change Featured Count to 10.
	3. Hit refresh button.
	4. In Featured Pane atmost 10 tiny editors should get populated.
    
     [idea] done tabbed UI alterations
    
    fixes #150
	
	1. Open the Betterdocs plugin, it should have two panes named Featured and all from left to 		right.
	2. Hit refresh button.

    [idea] #139 Handle non 200 HTTP response properly.
    
    fixes #139
    fixes #163
	
	1. Open Settings Panel.
	2. Change 'Elastic Search URL' to labs.imaginea.com.
	3. Apply.
	4. Hit refresh button.
	5. All Pane Should have message "Connection Error: 404 Not Found"
	6. No Exception is thrown.

    [idea] Repo name opens github on mouse click
    
    fixes #151
	
	1. Select code and hit refresh action.
	2. Check the featured pane tiny editors header clicking on the project names should open 
		project repo in github in browser.

    [idea] #157 Expire notification in case of no results.
    
    Since we show the query in help anyway.
	
	1. Select code and hit refresh action.
	2. If ES Result returns nothing notification should expire.

    [idea] fixes NullpointerException while using plugin
    
    fixes #135
	
	1. Plugin should not through NullPointerException while searching in non java files

    [idea] improved help message displayed initially to be more informative.
	
	1. When plugin opened initially help message in all pane should be "Got nothing to search..."

    [idea] improved help message for no results scenario.
	
	1. When ES returns no results help message in all pane should be "We tried querying our servers
	with: ..... but found no results"

    [idea] Show initial message centered.
	
	1. When plugin opened initially help message in all pane should be at center.

    [idea] Introduced async fetching of results from elastic search server.
    
    fixes #131
    fixes #127

	1. While fetching results IDE should not hang.

    [ideaplugin] show help info should autmatically bring the focus to main pane.
    
    Display the content centered.
	
	1. When help message is displayed all pane should get focus and help content should be in 			center.

    [ideaplugin] #141 Plugin throwing AIOBE has been fixed.
    Fixes #141
    Fixes #143

	1. Add this line 'import ' in your code and hit refresh buttion.
	2. NullPointerException will not be thrown.

    [ideaplugin] fixed the white background if highlighted code in new tab in main editor  is selected
    
    fixes #117
    fixes #125

	1. When results in all pane/featured pane opened as new tab in IDE, selecting highlighted code 
		should be visible.

    [ideaplugin] added git icon to tree nodes and goto github right click menu item
    
    fixes #129
	
	1. All Pane project tree non leaf nodes should have git icon.
	2. All Pane project tree nodes right click "Go to Github" should have git icon.

    [ideaplugin]fixed editor window scroll
    
    fixes #124
	
	1. All Pane preview editor should be scrollable.

    [ideaplugin] removed foldings from main pane editor
    
    modified wrong esURL message
    
    disposed tiny editors in code pane after usage
    
    fixes #112

	1. All Pane preview editor should not have code foldings
	2. No 'Editor has not been released..' Exception after closing the plugin.

    [ideaplugin] Right click and open files in a tab. + Expand to full source in a tab.
    
    fixes #56
    fixes #109


    made files in editor readonly
    
    added for jtree selection update preview pane, rightclick open in new tab
	
	1. Right clicking project tree leaf nodes should have menu item as "Open in new tab" and 			clicking that should open file in new tab in IDE.

	2. Opened file should be non editable.
	
	3. Selecting leaf node in project tree should load it's preview in all pane preview editor.

    [ideaplugin] Ignored case while searching for import names in the selected text region.
    
    fixes #114
    fixes #116

	1. Search should case insensitive.
	
    ##[ideaplugin] Registered window editor with disposer to release after it's usage.
    
    ###fixed scalastyle violation.
    
    ####fixes #67
    ####fixes #107
	
	1. No 'Editor has not been released..' Exception after closing the plugin
