
#### [ideaplugin] added git icon to tree nodes and goto github right click menu item
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/129'> #129 </a>
1. All Pane project tree non leaf nodes should have git icon.
2. All Pane project tree nodes right click "Go to Github" should have git icon.

#### [ideaplugin]fixed editor window scroll
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/124'> #124 </a>
1. All Pane preview editor should be scrollable.

#### [ideaplugin] removed foldings from main pane editor
##### modified wrong esURL message
##### disposed tiny editors in code pane after usage
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/112'> #112 </a>
1. All Pane preview editor should not have code foldings
2. No 'Editor has not been released..' Exception after closing the plugin.

#### [ideaplugin] Right click and open files in a tab. + Expand to full source in a tab.
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/56'> #56 </a>
##### made files in editor readonly
##### added for jtree selection update preview pane, rightclick open in new tab
1. Right clicking project tree leaf nodes should have menu item as "Open in new tab" and clicking that should open file in new tab in IDE.
2. Opened file should be non editable.
3. Selecting leaf node in project tree should load it's preview in all pane preview editor.

#### [ideaplugin] Ignored case while searching for import names in the selected text region.
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/114'> #114 </a>
1. Covered in ExtractImportsInLinesSuite test.

#### [ideaplugin] Registered window editor with disposer to release after it's usage.
##### fixes <a href='https://github.com/Imaginea/BetterDocs/issues/67'> #67 </a>
1. No 'Editor has not been released..' Exception after closing the plugin in idea.log
