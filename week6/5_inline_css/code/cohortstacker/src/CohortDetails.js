import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails(props) {
  const { cohort } = props;

  // Step 10: dynamic inline color for h3
  const headingStyle = {
    color: cohort.currentStatus === 'Ongoing' ? 'green' : 'blue'
  };

  return (
    <div className={styles.box}>
      <h3 style={headingStyle}>
        {cohort.cohortCode} -
        <span> {cohort.technology}</span>
      </h3>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startDate}</dd>
        <dt>Current Status</dt>
        <dd>{cohort.currentStatus}</dd>
        <dt>Coach</dt>
        <dd>{cohort.coachName}</dd>
        <dt>Trainer</dt>
        <dd>{cohort.trainerName}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
