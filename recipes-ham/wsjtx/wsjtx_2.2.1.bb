SUMMARY = "WSJT-X"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=6ee272f0a941cfe6ea96c7a0a7990260"

SRC_URI = "git://git.code.sf.net/p/wsjt/wsjtx;protocol=git;branch=master \
           file://0001-Add-shmem-dependency-to-jt9.patch \
           file://0002-Disable-openmp-code.patch \
          "

SRCREV = "a17eb964a23b9d0d438f59794d5860d8d084c9f7"

S = "${WORKDIR}/git"

DEPENDS = "qttools-native asciidoc-native libgfortran boost fftw libusb \
           qtmultimedia qtserialport hamlib qttools"

# WSPR, FT8 and other similar protocols require a synchronized system clock and
# adjusted volume levels. This is why ntpdate and alsamixer are recommended.
RRECOMMENDS_${PN} = "ntpdate alsa-utils-alsamixer"

inherit cmake_qt5

EXTRA_OECMAKE = " \
                 -DWSJT_GENERATE_DOCS='OFF' \
                 -Dhamlib_LIBRARY_DIRS='${WORKDIR}/recipe-sysroot/usr/lib/' \
                "

OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"
OECMAKE_GENERATOR = "Unix Makefiles"

INSANE_SKIP_${PN} += "already-stripped"

# Because some of the code is written in fortran, we'll need GCC with fortran
# support built-in. To enable this, you must add the following line to the
# conf/local.conf file:
#
# FORTRAN_forcevariable = ",fortran"
#
