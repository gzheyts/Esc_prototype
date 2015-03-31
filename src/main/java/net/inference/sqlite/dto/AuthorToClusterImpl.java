package net.inference.sqlite.dto;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import net.inference.database.dto.Author;
import net.inference.database.dto.AuthorToCluster;
import net.inference.database.dto.Cluster;

/**
 * Date: 2/15/2015
 * Time: 6:49 PM
 *
 * @author xanderblinov
 */
@DatabaseTable(tableName = AuthorToCluster.TABLE_NAME)
public class AuthorToClusterImpl implements AuthorToCluster
{
    @DatabaseField(generatedId = true)
    private long id;

	@DatabaseField(foreign = true, columnName = Column.author_id)
	private AuthorImpl author;
	@DatabaseField(foreign = true, columnName = Column.cluster_id)
	private ClusterImpl cluster;


	public AuthorToClusterImpl()
	{
	}

	public AuthorToClusterImpl(final Author author, final Cluster cluster)
	{
		setAuthor(author);
		setCluster(cluster);
	}


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = (AuthorImpl) author;
    }

    public Cluster getCluster() {
        return cluster;
    }

    public void setCluster(Cluster cluster) {
        this.cluster = (ClusterImpl) cluster;
    }
}
