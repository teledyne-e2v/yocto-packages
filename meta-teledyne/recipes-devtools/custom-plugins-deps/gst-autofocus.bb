require recipes-multimedia/gstreamer/gstreamer1.0-plugins-common.inc



GST1.0-PLUGINS-GOOD_SRC ?= "gitsm://github.com/teledyne-e2v/gst-multifocus.git;protocol=https"
SRCBRANCH = "main"

SRC_URI = " \
    ${GST1.0-PLUGINS-GOOD_SRC};branch=${SRCBRANCH} \
"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
DEFAULT_PREFERENCE = "-1"

S = "${WORKDIR}/git"

LICENSE = "GPLv2+ & LGPLv2.1+"

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "gstreamer1.0-plugins-base libcap zlib glibc"



COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
inherit meson
