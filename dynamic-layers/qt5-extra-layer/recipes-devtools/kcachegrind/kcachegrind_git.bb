SUMMARY = "kcachegrind"

DESCRIPTION = "Valgrind visualisation"

HOMEPAGE = "https://kcachegrind.github.io/"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50"

SRC_URI = "git://invent.kde.org/sdk/kcachegrind.git;protocol=https;branch=master"
SRCREV = "2c577622dae2218525a78f9d6ed41fac28fcad6d"

S = "${WORKDIR}/git"

inherit cmake_qt5

DEPENDS = "qtbase extra-cmake-modules"
