DESCRIPTION = "Image with teledyne custom configuration"

LICENSE = "MIT"


DEPENDS += "gcc make"
DEPENDS += " meson ninja "
DEPENDS += " packagegroup-core-buildessential"
DEPENDS += "gstreamer1.0-plugins-base"

DEPENDS += " \
gstreamer1.0-plugins-base \
gstreamer1.0-meta-base \
gstreamer1.0-omx \
 \
"
DEPENDS += " v4l-utils libv4l"

IMAGE_INSTALL +="gcc make"
IMAGE_INSTALL +=" meson ninja "
IMAGE_INSTALL +=" packagegroup-core-buildessential"
IMAGE_INSTALL +="gstreamer1.0-plugins-base"
IMAGE_INSTALL +=" \
gstreamer1.0-plugins-base \
gstreamer1.0-meta-base \
gstreamer1.0-omx \
 \
"
IMAGE_INSTALL +=" v4l-utils libv4l"

