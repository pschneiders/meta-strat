SUMMARY = "Ham Radio Control Library"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

# WSJT-X needs the forked version of hamlib instead of the main one
SRC_URI = "git://git.code.sf.net/u/bsomervi/hamlib;protocol=git;branch=master \
          "

SRCREV = "1bfa68feea284daa72a98943ff12a7b6c33fbc49"

S = "${WORKDIR}/git"

inherit autotools

# WSJT-X requires the /usr/bin files from here to be available in the sysroot
SYSROOT_DIRS += "${bindir}"
