DESCRIPTION = "GNU unit testing framework, written in Expect and Tcl"
LICENSE = "GPLv2"
SECTION = "devel"
PR = "r1"

#set1hr_timeout.patch increases default 5min timeout to 1hour;
#due to Yocto being very resource demanding such a timeout makes sense
SRC_URI = "ftp://ftp.gnu.org/gnu/dejagnu/dejagnu-${PV}.tar.gz \
           file://set1hr_timeout.patch"

inherit autotools

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
