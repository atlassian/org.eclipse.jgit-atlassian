import org.eclipse.jgit.lib.RepositoryTestCase;
		write(new File(db.getDirectory().getParent(), "test.txt"), "test");
		File folder = new File(db.getDirectory().getParent(), "folder");
		List<DiffEntry> entries = git.diff().call();
		write(new File(db.getDirectory().getParent(), "test.txt"), "test");
		File folder = new File(db.getDirectory().getParent(), "folder");
		List<DiffEntry> entries = git.diff().setCached(true).call();