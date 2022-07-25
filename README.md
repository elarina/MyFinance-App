# MyFinances-App
Financial accounting application based on Eclipse RCP.

# Run from IDE

## Import to workspace
1. Run in command line: git clone https://github.com/elarina/MyFinance-App.git MyFinances-App
2. Open Eclipse IDE for RCP and RAP Developers.
3. File -> Import -> Plug-in Development -> Plug-ins and Fragments -> Next
4. In "Import From" group choose "Directory"
5. In "Plug-ins and Fragments to Import" choose "Select from all plug-ins and fragments found at the specified location"
6. In "Import As" choose "Projects with source folders"
7. Next
8. Add All
9. Finish

## Run configurations
1. Run -> Run Configurations
2. Eclipse Application -> New launch configuration
3. In "Program to Run" choose "Run a Product" with the value "my.finances.app.product"
4. Go to Plug-ins tab
5. In "Launch with" choose "plug-ins selected below only"
6. Deselect All
7. Add Required Plug-ins
8. Apply
9. Run
