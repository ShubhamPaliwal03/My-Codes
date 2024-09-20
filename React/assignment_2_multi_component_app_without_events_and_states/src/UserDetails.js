import './UserDetails.css';

// detailed info like :- contact info, social media links, location, work experience

function UserDetails({workEx, location, contactInfo, socialMediaLinks}) {

    return (

        <div className="userDetails">
            <ul>
                <h4>Work Experience :-</h4>
                <li>
                    <small>
                        <strong>{workEx.post}</strong> at <strong>{workEx.company}</strong> ~ <em>{workEx.duration.start} - {workEx.duration.end}</em>
                    </small>
                </li>
                <h4>Contact Information :-</h4>
                <li>
                    <ol>
                        <li>Phone : {contactInfo.phone}</li>
                        <li>Email : {contactInfo.email}</li>
                    </ol>
                </li>
                <li>
                    <h4>Location :-</h4>
                    <ol>
                        <li>{location}</li>
                    </ol>
                </li>
                <h4>Social Media Links :-</h4>
                <li>
                    <ol>
                        <li>
                            <a href={socialMediaLinks.linkedin}>LinkedIn</a>
                        </li>
                        <br/>
                        <li>
                            <a href={socialMediaLinks.twitter}>Twitter</a>
                        </li>
                    </ol>
                </li>
            </ul>
        </div>
    );
}

export default UserDetails;