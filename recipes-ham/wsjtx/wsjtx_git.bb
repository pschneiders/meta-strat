SUMMARY = "WSJT-X"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=6ee272f0a941cfe6ea96c7a0a7990260"

SRC_URI = "git://git.code.sf.net/p/wsjt/wsjtx;protocol=git;branch=master \
           file://0001-Disable-openmp-code.patch \
          "

SRCREV = "24fcd17a2a00962c8a8254666345b677b628f92b"

S = "${WORKDIR}/git"

DEPENDS = "qttools-native asciidoc-native libgfortran boost fftw libusb qtmultimedia qtserialport hamlib qttools"

inherit cmake_qt5

EXTRA_OECMAKE = " \
                 -DWSJT_GENERATE_DOCS='OFF' \
                 -Dhamlib_LIBRARY_DIRS='${WORKDIR}/recipe-sysroot/usr/lib/' \
                "

OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"
OECMAKE_GENERATOR = "Unix Makefiles"

INSANE_SKIP_${PN} += "already-stripped"
