package eu.modernmt.context;

import eu.modernmt.model.ContextVector;
import eu.modernmt.model.Domain;
import eu.modernmt.model.corpus.Corpus;

import java.io.Closeable;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * Created by davide on 02/12/15.
 */
public interface ContextAnalyzer extends Closeable {

    void add(Domain domain, Corpus corpus) throws ContextAnalyzerException;

    void add(Map<Domain, Corpus> corpora) throws ContextAnalyzerException;

    ContextVector getContextVector(String query, int limit) throws ContextAnalyzerException;

    ContextVector getContextVector(File source, int limit) throws ContextAnalyzerException;

    ContextVector getContextVector(Corpus query, int limit) throws ContextAnalyzerException;

}
