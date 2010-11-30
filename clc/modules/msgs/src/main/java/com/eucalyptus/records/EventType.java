/*******************************************************************************
 *Copyright (c) 2009  Eucalyptus Systems, Inc.
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, only version 3 of the License.
 * 
 * 
 *  This file is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  for more details.
 * 
 *  You should have received a copy of the GNU General Public License along
 *  with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 *  Please contact Eucalyptus Systems, Inc., 130 Castilian
 *  Dr., Goleta, CA 93101 USA or visit <http://www.eucalyptus.com/licenses/>
 *  if you need additional information or have any questions.
 * 
 *  This file may incorporate work covered under the following copyright and
 *  permission notice:
 * 
 *    Software License Agreement (BSD License)
 * 
 *    Copyright (c) 2008, Regents of the University of California
 *    All rights reserved.
 * 
 *    Redistribution and use of this software in source and binary forms, with
 *    or without modification, are permitted provided that the following
 *    conditions are met:
 * 
 *      Redistributions of source code must retain the above copyright notice,
 *      this list of conditions and the following disclaimer.
 * 
 *      Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 * 
 *    THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 *    IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 *    TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 *    PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 *    OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *    EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *    PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 *    PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *    LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *    NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *    SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. USERS OF
 *    THIS SOFTWARE ACKNOWLEDGE THE POSSIBLE PRESENCE OF OTHER OPEN SOURCE
 *    LICENSED MATERIAL, COPYRIGHTED MATERIAL OR PATENTED MATERIAL IN THIS
 *    SOFTWARE, AND IF ANY SUCH MATERIAL IS DISCOVERED THE PARTY DISCOVERING
 *    IT MAY INFORM DR. RICH WOLSKI AT THE UNIVERSITY OF CALIFORNIA, SANTA
 *    BARBARA WHO WILL THEN ASCERTAIN THE MOST APPROPRIATE REMEDY, WHICH IN
 *    THE REGENTS’ DISCRETION MAY INCLUDE, WITHOUT LIMITATION, REPLACEMENT
 *    OF THE CODE SO IDENTIFIED, LICENSING OF THE CODE SO IDENTIFIED, OR
 *    WITHDRAWAL OF THE CODE CAPABILITY TO THE EXTENT NEEDED TO COMPLY WITH
 *    ANY SUCH LICENSES OR RIGHTS.
 *******************************************************************************/
/*
 * @author chris grzegorczyk <grze@eucalyptus.com>
 */

package com.eucalyptus.records;

public enum EventType {
  ADDRESS_ALLOCATE,
  ADDRESS_ASSIGNED,
  ADDRESS_ASSIGNING,
  ADDRESS_DISASSOCIATE,
  ADDRESS_RELEASE,
  ADDRESS_STATE,
  ADDRESS_ASSIGN,
  ADDRESS_PENDING,
  ADDRESS_UNASSIGN,
  ADDRESS_UNASSIGNING,
  BINDING_SEEDED,
  BOGUS,
  BOOTSTRAP_INIT_COMPONENT,
  BOOTSTRAP_INIT_CONFIGURATION,
  BOOTSTRAP_INIT_DISCOVERY,
  BOOTSTRAP_INIT_RESOURCES,
  BOOTSTRAP_INIT_SERVICE_CONFIG,
  BOOTSTRAP_INIT_SERVICE_DISABLED,
  BOOTSTRAPPER_ADDED,
  BOOTSTRAPPER_ERROR,
  BOOTSTRAPPER_INIT,
  BOOTSTRAPPER_LOAD,
  BOOTSTRAPPER_SKIPPED,
  BOOTSTRAPPER_CHECK,
  BOOTSTRAPPER_START,
  BOOTSTRAPPER_ENABLE,
  BOOTSTRAPPER_DISABLE,
  BOOTSTRAPPER_STOP,
  BOOTSTRAPPER_DESTROY,
  BOOTSTRAP_RESOURCES_PROPERTIES,
  BOOTSTRAP_RESOURCES_SERVICE_CONFIG,
  BOOTSTRAP_RESOURCES_SERVICE_DISABLED,
  BOOTSTRAP_STAGE_AGENDA,
  BOOTSTRAP_STAGE_BEGIN,
  BOOTSTRAP_STAGE_COMPLETE,
  BOOTSTRAP_STAGE_LOAD,
  BOOTSTRAP_STAGE_SKIPPED,
  BOOTSTRAP_STAGE_START,
  BOOTSTRAP_STAGE_TRANSITION,
  BUNDLE_CANCELING,
  BUNDLE_CANCELLED,
  BUNDLE_PENDING,
  BUNDLE_RESET,
  BUNDLE_STARTED,
  BUNDLE_STARTING,
  BUNDLE_TRANSITION,
  CERTIFICATE_WRITE,
  CHANNEL_WRITE,
  CHANNEL_OPEN,
  CHANNEL_CLOSED,
  CHANNEL_OPENING,
  CLUSTER_CERT,
  CLUSTER_STATE_HANDLER_REGISTERED,
  CLUSTER_STATE_UPDATE,
  COMPONENT_DEREGISTERED,
  COMPONENT_INFO,
  COMPONENT_LIFECYCLE,
  COMPONENT_REGISTERED,
  COMPONENT_REGISTRY_DUMP,
  COMPONENT_SERVICE_INIT,
  COMPONENT_SERVICE_REGISTERED,
  COMPONENT_SERVICE_START,
  COMPONENT_SERVICE_STOP,
  CONFIG_VLANS,
  CONTEXT_CLEAR,
  CONTEXT_CREATE,
  CONTEXT_EVENT,
  CONTEXT_MSG,
  CONTEXT_SUBJECT,
  CONTEXT_USER,
  DISCOVERY_FINISHED,
  DISCOVERY_LOADED_ENTRY,
  DISCOVERY_STARTED,
  FLUSH_CACHE,
  GENERATE_CERTIFICATE,
  GENERATE_KEYPAIR,
  LIFECYCLE_COMMIT,
  LIFECYCLE_TRANSITION,
  LIFECYCLE_TRANSITION_DEREGISTERED,
  LIFECYCLE_TRANSITION_FAILED,
  LIFECYCLE_TRANSITION_REGISTERED,
  LISTENER_DEREGISTERED,
  LISTENER_DESTROY_ALL,
  LISTENER_EVENT_FIRED,
  LISTENER_EVENT_VETOD,
  LISTENER_REGISTERED,
  MSG_AWAIT_RESPONSE,
  MSG_PENDING,
  MSG_POLL_INTERNAL,
  MSG_PREPARED,
  MSG_RECEIVED,
  MSG_REJECTED,
  MSG_REPLY,
  MSG_SENT,
  MSG_SENT_ASYNC,
  MSG_SERVICED,
  PERSISTENCE,
  PERSISTENCE_ENTITY_REGISTERED,
  PIPELINE_DUPLICATE,
  PIPELINE_HANDLER,
  PIPELINE_UNROLL,
  PROVIDER_CONFIGURED,
  PROVIDER_CONFLICT,
  PROVIDER_IGNORED,
  DEQUEUE,
  QUEUE,
  QUEUE_LENGTH,
  QUEUE_TIME,
  SERVICE_TIME,
  SOCKET_BYTES_READ,
  SOCKET_BYTES_WRITE,
  SOCKET_CLOSE,
  SOCKET_OPEN,
  SYSTEM_DIR_CHECK,
  SYSTEM_DIR_CREATE,
  SYSTEM_START,
  SYSTEM_STOP,
  TIMEOUT,
  TOKEN_ACCEPTED,
  TOKEN_ALLOCATED,
  TOKEN_CHILD,
  TOKEN_REDEEMED,
  TOKEN_RESERVED,
  TOKEN_RETURNED,
  TOKEN_SPLIT,
  TOKEN_SUBMITTED,
  TRANSITION,
  TRANSITION_LISTENER,
  TRANSITION_BEGIN,
  TRANSITION_COMMIT,
  TRANSITION_TOP,
  TRANSITION_BOTTOM,
  TRANSITION_FINISHED,
  TRANSITION_POST,
  TRANSITION_PREPARE,
  TRANSITION_ROLLBACK,
  VM_PREPARE,
  VM_RESERVED,
  VM_RUNNING,
  VM_START_ABORTED,
  VM_START_COMPLETED,
  VM_STARTING,
  VM_STATE,
  VM_TERMINATED,
  VM_TERMINATING,
  USER_ADDED,
  USER_DELETED,
  GROUP_ADDED,
  GROUP_DELETED,
  GROUP_MEMBER_REMOVED,
  GROUP_AUTH_GRANTED,
  GROUP_AUTH_REVOKED,
  GROUP_MEMBER_ADDED,
  VOLUME_CREATE,
  VOLUME_DELETE,
  VOLUME_ATTACH,
  VOLUME_DETACH,
  SNAPSHOT_CREATE,
  SNAPSHOT_DELETE, 
  FUTURE,
  CALLBACK, 
}
