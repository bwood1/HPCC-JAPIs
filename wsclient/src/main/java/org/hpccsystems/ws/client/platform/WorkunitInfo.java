package org.hpccsystems.ws.client.platform;

import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLQuery;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_58.NamedValue;

// This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.
public class WorkunitInfo extends org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLWorkunit implements
        Comparable<org.hpccsystems.ws.client.platform.WorkunitInfo>
{
    private int               maxMonitorTime   = HPCCWsWorkUnitsClient.defaultMaxWaitTime;
    private int               sleepMillis      = HPCCWsWorkUnitsClient.defaultWaitTime;
    private NamedValue[]      namedValues      = null;
    private String originalEclWatchUrl=null;

    /**
     * Create an ECL workunit from a axis-generated soap class ECL Workunit
     * 
     * @param base
     */
    public WorkunitInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLWorkunit base)
    {
        copy(base);
    }

    public WorkunitInfo() {}

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(org.hpccsystems.ws.client.platform.WorkunitInfo wu)
    {
        if (wu == null || wu.getWuid() == null)
        {
            return 0;
        }
        else
        {
            // by default, sort by wuid descending, like ECL Watch
            return wu.getWuid().compareTo(this.getWuid());
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("wuid:").append(String.valueOf(getWuid())).append("\n");
        sb.append("owner:").append(String.valueOf(getOwner())).append("\n");
        sb.append("cluster:").append(String.valueOf(getCluster())).append("\n");
        sb.append("roxieCluster:").append(String.valueOf(getRoxieCluster())).append("\n");
        sb.append("jobname:").append(String.valueOf(getJobname())).append("\n");
        sb.append("queue:").append(String.valueOf(getQueue())).append("\n");
        sb.append(" stateID:").append(String.valueOf(getStateID())).append("\n");
        sb.append("state:").append(String.valueOf(getState())).append("\n");
        sb.append("stateEx:").append(String.valueOf(getStateEx())).append("\n");
        sb.append("description:").append(String.valueOf(getDescription())).append("\n");
        sb.append(" action:").append(String.valueOf(getAction())).append("\n");
        sb.append("actionEx:").append(String.valueOf(getActionEx())).append("\n");
        sb.append("dateTimeScheduled:").append(String.valueOf(getDateTimeScheduled())).append("\n");
        sb.append(" priorityClass:").append(String.valueOf(getPriorityClass())).append("\n");
        sb.append(" priorityLevel:").append(String.valueOf(getPriorityLevel())).append("\n");
        sb.append("scope:").append(String.valueOf(getScope())).append("\n");
        sb.append("snapshot:").append(String.valueOf(getSnapshot())).append("\n");
        sb.append(" resultLimit:").append(String.valueOf(getResultLimit())).append("\n");
        sb.append(" eventSchedule:").append(String.valueOf(getEventSchedule())).append("\n");
        sb.append("totalThorTime:").append(String.valueOf(getTotalClusterTime())).append("\n");
        sb.append(" errorCount:").append(String.valueOf(getErrorCount())).append("\n");
        sb.append(" warningCount:").append(String.valueOf(getWarningCount())).append("\n");
        sb.append(" infoCount:").append(String.valueOf(getInfoCount())).append("\n");
        sb.append(" graphCount:").append(String.valueOf(getGraphCount())).append("\n");
        sb.append(" sourceFileCount:").append(String.valueOf(getSourceFileCount())).append("\n");
        sb.append(" resultCount:").append(String.valueOf(getResultCount())).append("\n");
        sb.append(" variableCount:").append(String.valueOf(getVariableCount())).append("\n");
        sb.append(" timerCount:").append(String.valueOf(getTimerCount())).append("\n");
        sb.append("hasDebugValue:").append(String.valueOf(this.getHasDebugValue())).append("\n");
        sb.append(" applicationValueCount:").append(String.valueOf(getApplicationValueCount())).append("\n");
        sb.append("xmlParams:").append(String.valueOf(getXmlParams())).append("\n");
        sb.append(" accessFlag:").append(String.valueOf(getAccessFlag())).append("\n");
        sb.append(" clusterFlag:").append(String.valueOf(getClusterFlag())).append("\n");
        sb.append("helpersDesc:").append(String.valueOf(getHelpersDesc())).append("\n");
        sb.append("graphsDesc:").append(String.valueOf(getGraphsDesc())).append("\n");
        sb.append("sourceFilesDesc:").append(String.valueOf(getSourceFilesDesc())).append("\n");
        sb.append("resultsDesc:").append(String.valueOf(getResultsDesc())).append("\n");
        sb.append("variablesDesc:").append(String.valueOf(getVariablesDesc())).append("\n");
        sb.append("timersDesc:").append(String.valueOf(getTimersDesc())).append("\n");
        sb.append("debugValuesDesc:").append(String.valueOf(getDebugValuesDesc())).append("\n");
        sb.append("applicationValuesDesc:").append(String.valueOf(getApplicationValuesDesc())).append("\n");
        sb.append("workflowsDesc:").append(String.valueOf(getWorkflowsDesc())).append("\n");
        sb.append("hasArchiveQuery:").append(String.valueOf(this.getHasArchiveQuery())).append("\n");
        // TODO: include the content of unappended objects to the string
        return sb.toString();
    }

    /**
     * Copy a soap ecl workunit object into the wrapper
     * 
     * @param base
     */
    private void copy(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLWorkunit base)
    {
        if (base == null)
        {
            return;
        }
        
        this.setAccessFlag(base.getAccessFlag());
        this.setAction(base.getAction());
        this.setActionEx(base.getActionEx());
        this.setActive(base.getActive());
        this.setAlertCount(base.getAlertCount());
        this.setAllowedClusters(base.getAllowedClusters());
        this.setApplicationValueCount(base.getApplicationValueCount());
        this.setApplicationValues(base.getApplicationValues());
        this.setApplicationValuesDesc(base.getApplicationValuesDesc());
        this.setArchived(base.getArchived());
        this.setCluster(base.getCluster());
        this.setClusterFlag(base.getClusterFlag());
        this.setDateTimeScheduled(base.getDateTimeScheduled());
        this.setDebugValueCount(base.getDebugValueCount());
        this.setDebugValues(base.getDebugValues());
        this.setDebugValuesDesc(base.getDebugValuesDesc());
        this.setDescription(base.getDescription());        
        this.setErrorCount(base.getErrorCount());
        this.setEventSchedule(base.getEventSchedule());
        this.setExceptions(base.getExceptions());
        this.setGraphCount(base.getGraphCount());
        this.setGraphs(base.getGraphs());
        this.setGraphsDesc(base.getGraphsDesc());
        this.setHasArchiveQuery(base.getHasArchiveQuery());
        this.setHasDebugValue(base.getHasDebugValue());
        this.setHelpers(base.getHelpers());
        this.setHelpersDesc(base.getHelpersDesc());
        this.setInfoCount(base.getInfoCount());
        this.setIsPausing(base.getIsPausing());
        this.setJobname(base.getJobname());
        this.setOwner(base.getOwner());
        this.setPriorityClass(base.getPriorityClass());
        this.setPriorityLevel(base.getPriorityLevel());
        this.setQuery(base.getQuery());
        this.setQueue(base.getQueue());
        this.setResourceURLCount(base.getResourceURLCount());
        this.setResourceURLs(base.getResourceURLs());
        this.setResultCount(base.getResultCount());
        this.setResultLimit(base.getResultLimit());
        this.setResults(base.getResults());
        this.setResultsDesc(base.getResultsDesc());
        this.setRoxieCluster(base.getRoxieCluster());
        this.setScope(base.getScope());
        this.setSnapshot(base.getSnapshot());
        this.setSourceFileCount(base.getSourceFileCount());
        this.setSourceFiles(base.getSourceFiles());
        this.setSourceFilesDesc(base.getSourceFilesDesc());
        this.setState(base.getState());
        this.setStateEx(base.getStateEx());
        this.setStateID(base.getStateID());
        this.setTimerCount(base.getTimerCount());
        this.setTimersDesc(base.getTimersDesc());
        this.setTimingData(base.getTimingData());
        this.setTotalClusterTime(base.getTotalClusterTime());
        this.setVariableCount(base.getVariableCount());
        this.setVariables(base.getVariables());
        this.setThorLCR(base.getThorLCR());
        this.setThorLogList(base.getThorLogList());        
        this.setVariablesDesc(base.getVariablesDesc());
        this.setWarningCount(base.getWarningCount());
        this.setWorkflowCount(base.getWorkflowCount());
        this.setWorkflows(base.getWorkflows());
        this.setWorkflowsDesc(base.getWorkflowsDesc());
        this.setWuid(base.getWuid());
        this.setXmlParams(base.getXmlParams());

    }

    public boolean update(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLWorkunit wu)
    {
        boolean retVal = false;
        if (wu != null && this.getWuid().equals(wu.getWuid()) && !this.equals(wu))
        {
            if (updateState(wu))
            {
                retVal = true;
            }
            // RODRIGO other updates missing here...
        }
        return retVal;
    }

    synchronized boolean updateState(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLWorkunit wu)
    {
        boolean retVal = false;
        if (wu != null && this.getWuid().equals(wu.getWuid()))// && this.compareTo(wu))
        {
            this.setStateID(wu.getStateID());
            this.setStateEx(wu.getStateEx());
            this.setState(wu.getState());
            // setChanged();
            retVal = true;
        }
        return retVal;
    }


    public void setMaxMonitorMillis(int time)
    {
        maxMonitorTime = time;
    }

    public int getMaxMonitorMillis()
    {
        return maxMonitorTime;
    }

    public Integer getSleepMillis()
    {
        return sleepMillis;
    }

    public void setSleepMillis(Integer sleepTime)
    {
        this.sleepMillis = sleepTime;
    }

    /**
     * Gets the resultLimit value for this ECLWorkunit.
     * 
     * @return resultLimit
     */
    @Override
    public java.lang.Integer getResultLimit()
    {
        if (super.getResultLimit() == null)
        {
            return HPCCWsWorkUnitsClient.defaultResultLimit;
        }
        return super.getResultLimit();
    }

    public NamedValue[] getNamedValues()
    {
        return namedValues;
    }

    public void setNamedValues(NamedValue[] namedValues)
    {
        this.namedValues = namedValues;
    }

    public void setECL(String ecl)
    {
        if (this.getQuery() == null)
        {
            this.setQuery(new ECLQuery());
        }
        this.getQuery().setText(ecl);
    }

    public String getECL()
    {
        if (this.getQuery() == null)
        {
            return "";
        }
        return this.getQuery().getText();
    }

	public String getOriginalEclWatchUrl() {
		return originalEclWatchUrl;
	}

	public void setOriginalEclWatchUrl(String serverhost) {
		this.originalEclWatchUrl=serverhost;
	}
    
}
