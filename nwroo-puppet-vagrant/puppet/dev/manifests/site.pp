node 'dev.nwroo.vm' {
	service { 'ip6tables':
	    ensure    => stopped,
	    enable    => false,
	}

	service { 'iptables':
	    ensure    => stopped,
	    enable    => false,
	}
}