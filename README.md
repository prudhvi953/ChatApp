#### [idea] Show initial message centered.
1. When plugin opened initially help message in all pane should be at center.
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/centered_help_info.png'/> <br>
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/es_no_results_info.png'/> <br>
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/only_java.png'/> <br>

####[idea] Introduced async fetching of results from elastic search server.
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/131'> #131 </a>
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/127'> #127 </a>
1. While fetching results IDE should not hang.

#### [ideaplugin] show help info should autmatically bring the focus to main pane.
##### Display the content centered.
1. When help message is displayed all pane should get focus and help content should be in 			center.

#### [ideaplugin] #141 Plugin throwing AIOBE has been fixed.
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/141'> #141 </a>
1. Add this line 'import ' in your code and hit refresh buttion.
2. NullPointerException will not be thrown.

#### [ideaplugin] fixed the white background if highlighted code in new tab in main editor  is selected
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/117'> #117 </a>
1. When results in all pane/featured pane opened as new tab in IDE, selecting highlighted code 
	should be visible.
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/117_1.png'/> <br>
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/117_2.png'/> <br>

#### [ideaplugin] added git icon to tree nodes and goto github right click menu item
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/129'> #129 </a>
1. All Pane project tree non leaf nodes should have git icon.
2. All Pane project tree nodes right click "Go to Github" should have git icon.
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/129_1.png'/> <br>
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/129_2.png'/> <br>

#### [ideaplugin]fixed editor window scroll
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/124'> #124 </a>
1. All Pane preview editor should be scrollable.<br>
2. <img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/124.png'/>

#### [ideaplugin] removed foldings from main pane editor
##### modified wrong esURL message
##### disposed tiny editors in code pane after usage
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/112'> #112 </a>
1. All Pane preview editor should not have code foldings
2. No 'Editor has not been released..' Exception after closing the plugin.<br>
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/109_2.png'/> 

#### [ideaplugin] Right click and open files in a tab. + Expand to full source in a tab.
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/56'> #56 </a>
##### made files in editor readonly
##### added for jtree selection update preview pane, rightclick open in new tab
1. Right clicking project tree leaf nodes should have menu item as "Open in new tab" and clicking that should open file in new tab in IDE.
2. Opened file should be non editable.
3. Selecting leaf node in project tree should load it's preview in all pane preview editor.<br>
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/109_1.png'/> <br>
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/109_3.png'/> <br>
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/109_2.png'/> <br>

#### [ideaplugin] Ignored case while searching for import names in the selected text region.
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/114'> #114 </a>
1. Covered in ExtractImportsInLinesSuite test.<br>
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/114_1.png'/>
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/114_2.png'/>

#### [ideaplugin] Registered window editor with disposer to release after it's usage.
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/67'> #67 </a>
1. No 'Editor has not been released..' Exception after closing the plugin in idea.log/console.
<img src='https://raw.githubusercontent.com/prudhvije/ChatApp/chat/test/images/107.png'/> 
