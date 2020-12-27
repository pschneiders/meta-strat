SUMMARY = "GPredict"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=892f569a555ba9c07a568a7c0c4fa63a"

SRC_URI = "git://github.com/csete/gpredict.git;protocol=git;branch=master \
        "
SRCREV = "ee84d89ad18b27b2f8e7d693eed8dd0f1cfa44e9"
S = "${WORKDIR}/git"

inherit autotools-brokensep gettext

DEPENDS = "glib-2.0-native libtool-native intltool-native curl glib-2.0 goocanvas"

RSUGGESTS_${PN} = "ntpdate"
