# Question 1
# Create And Verify Data And Permissions Of Final.txt
user@ubuntu:~$ cat > final.txt
Debian
Fedora
^C
user@ubuntu:~$ cat final.txt
Debian
Fedora
user@ubuntu:~$ ls -l final.txt
-rw-rw-r-- 1 user user 14 Apr 18 13:26 final.txt

# Remove Read Permissions From All Users
user@ubuntu:~$ chmod a-r final.txt
user@ubuntu:~$ ls -l final.txt
--w--w---- 1 user user 14 Apr 18 13:26 final.txt

# Only Give Read Permissions To Others
user@ubuntu:~$ chmod 004 final.txt
user@ubuntu:~$ ls -l final.txt
-------r-- 1 user user 14 Apr 18 13:26 final.txt

# Verify Partitional Table Of HDD Using lsblk
user@ubuntu:~$ lsblk
NAME   MAJ:MIN RM SIZE RO TYPE MOUNTPOINT
sda      8:0    0  40G  0 disk
└─sda1   8:1    0  40G  0 part /

# Verify Partitional Table Of HDD Using fdisk
user@ubuntu:~$ sudo fdisk -l
Disk /dev/sda: 40 GiB, 42949672960 bytes, 83886080 sectors
Units: sectors of 1 * 512 = 512 bytes
Sector size (logical/physical): 512 bytes / 512 bytes
I/O size (minimum/optimal): 512 bytes / 512 bytes
Disklabel type: dos
Disk identifier: 0xa1e16a18

Device     Boot Start      End  Sectors Size Id Type
/dev/sda1  *     2048 83884031 83881984  40G 83 Linux


user@ubuntu:~$ lsmod | grep video
video                  45056  0
user@ubuntu:~$ /sbin/modinfo video
filename:       /lib/modules/4.15.0-140-generic/kernel/drivers/acpi/video.ko
license:        GPL
description:    ACPI Video Driver
author:         Bruno Ducrot
srcversion:     9A61D44526A9A616FA27912
alias:          acpi*:LNXVIDEO:*
depends:
retpoline:      Y
intree:         Y
name:           video
vermagic:       4.15.0-140-generic SMP mod_unload
signat:         PKCS#7
signer:
sig_key:
sig_hashalgo:   md4
parm:           brightness_switch_enabled:bool
parm:           allow_duplicates:bool
parm:           disable_backlight_sysfs_if:int
parm:           report_key_events:0: none, 1: output changes, 2: brightness changes, 3: all (int)
parm:           hw_changes_brightness:Set this to 1 on buggy hw which changes the brightness itself when a hotkey is pressed: -1: auto, 0: normal 1: hw-changes-brightness (int)
parm:           device_id_scheme:bool
parm:           only_lcd:int


user@ubuntu:~$ sudo rmmod e100
