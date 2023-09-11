# BBAPPEND files
##### You can find in this repository the bbappend file with all the packages needed to compile the gstreamer plugins provided by Teledyne e2V.

The detailed process to add the bbappend file is specified in this github :
https://github.com/teledyne-e2v/teledyne-yocto#adding-packages-to-the-recipe

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

## Adding packages to the recipe
To add a package to the recipe file, the easiest way is to add them to the list of packages in the **IMAGE_INSTALL** variable. For example, if you want to add the packages **package1** and **package2**:
```
IMAGE_INSTALL += " \
    ${CONMANPKGS} \
    ${GRAPHICAL} \
    ${GSTREAMER} \
    i2c-tools \
    v4l-utils \
    xauth \
    package1 \
    package2 \
    "
```
However, a more recommended practice when you want to modify a recipe, is to create a ```.bbappend``` file:

1. Create a file at the same location as the ```core-image-teledyne.bb``` file, with the same name, but using the **.bbappend** extension instead of **.bb**. Your directory should look like the following:
```
ls ${TELEDYNE_DEVDIR}/meta-teledyne/recipes-images/images/
core-image-teledyne.bb  core-image-teledyne.bbappend 
```
2. In the new ```core-image-teledyne.bbappend``` file, add the variable **IMAGE_INSTALL_append**, and assign to this variable the list of packages that you want to add. For example, if you want to add the packages **package1** and **package2**, your file should look like the following:
```
IMAGE_INSTALL_append = " \
    package1 \
    package2 \
    "
```
