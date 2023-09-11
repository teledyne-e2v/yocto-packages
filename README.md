# BBAPPEND files
##### You can find in this repository the bbappend file with all the packages needed to compile the gstreamer plugins provided by Teledyne e2V.

This file will install the following packages : 
- gcc
- make
- ninja
- meson
- packagegroup-core-buildessential (provide autotools)
- gstreamer1.0-plugins-base
- gstreamer1.0-meta-base
- gstreamer1.0-omx
- v4l-utils 
- libv4l
- gstreamer1.0-plugins-base-dev

## Adding the packages to the recipe

To add these packages to the recipe file, the easiest way is to add the ```core-image-teledyne.bbappend``` file to the same location as the ```core-image-teledyne.bb``` file. Your directory should look like the following:
```
ls ${TELEDYNE_DEVDIR}/meta-teledyne/recipes-images/images/
core-image-teledyne.bb  core-image-teledyne.bbappend 
```

The detailed process to add the bbappend file is specified in this github :
https://github.com/teledyne-e2v/teledyne-yocto#adding-packages-to-the-recipe
