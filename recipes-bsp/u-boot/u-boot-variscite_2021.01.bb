require recipes-bsp/u-boot/u-boot-ti.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=5a7450c57ffe5ae63fd732446b988025"

UBOOT_INITIAL_ENV = "u-boot-initial-env"
SRC_URI += "file://fw_env.config"

UBOOT_GIT_URI = "git://github.com/varigit/ti-u-boot"

BRANCH = "ti-u-boot-2021.01_var01"
SRCREV = "de651a1b9a229735a841f8bb1774718c7fcf9752"

BRANCH:am335x-var-som = "ti-u-boot-2021.01_08.02.00.006_var01"
SRCREV:am335x-var-som = "bd74bc09760bad17392d4740fdb8b2935ae7ccc1"
